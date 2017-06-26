package cn.itcast.usermanage.bean;

import java.util.List;

public class EasyUIResult {
    
        private Long total;
        
        private List<?> rows;

        public Long getTotal() {
            return total;
        }

        public void setTotal(Long total) {
            this.total = total;
        }

        public List<?> getRows() {
            return rows;
        }

        public void setRows(List<?> rows) {
            this.rows = rows;
        }

        public EasyUIResult(Long total, List<?> rows) {
            super();
            this.total = total;
            this.rows = rows;
        }

        public EasyUIResult() {
            super();
        }
        
        
}
