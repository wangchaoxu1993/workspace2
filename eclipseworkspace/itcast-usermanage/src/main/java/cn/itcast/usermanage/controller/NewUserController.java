package cn.itcast.usermanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itcast.usermanage.pojo.User;
import cn.itcast.usermanage.service.UserService;

@RequestMapping("new/user")
@Controller
public class NewUserController {

    @Autowired
    private UserService userService;

    // 根据用户id查询用户信息
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<User> queryUserById(@PathVariable("id") Long id) {
        User user = this.userService.queryUserById(id);
        try {
            if (null == user) {
                // 资源不存在，响应404
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            // 资源存在，响应200
            // return ResponseEntity.status(HttpStatus.OK).body(user);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    public ResponseEntity<Void> saveUser(User user) {
        Boolean bool = this.userService.saveUser(user);
        try {
            if (bool) {
                // 新增成功，响应201
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 新增失败，响应500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> update(User user){
        try {
            Boolean bool = this.userService.updateUser(user);
            if(bool){
                // 更新成功，响应201
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 新增失败，响应500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    
    
    
}