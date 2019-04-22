package cn.jbit.spring101306.dao;

    public class TempDaoImpl extends JdbcDaoSupport implements ITempDao {
        @Override
        public void save(Temp temp) {
            this.getJdbcTemplate().update("insert into temp(tid,tname) values(?,?)",temp.getTempId(),temp.getTempName());
        }

        @Override
        public void update(Temp temp) {
            this.getJdbcTemplate().update("update temp set tname=? where tid=?",temp.getTempName(),temp.getTempId());
        }

        @Override
        public void delete(int id) {
            this.getJdbcTemplate().update("delete from temp where tid = ?",id);
        }

        @Override
        public int findCount() {
            return this.getJdbcTemplate().queryForInt("select count(1) from temp");
        }
    }
}
