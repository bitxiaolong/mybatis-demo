package cn.jbit.spring101306.dao;

public interface ITempDao {
        public void save(Temp temp);
        public void update(Temp temp);
        public void delete(int id);
        public int findCount();
    }
}
