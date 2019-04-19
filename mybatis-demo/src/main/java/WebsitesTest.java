import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class WebsitesTest {
    //查询单个学生
    public static void SelectWebsites () throws IOException {
//加载配置文件，目的为访问数据库
        //select语句
        InputStream re = Resources.getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(re) ;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String eo = "src.main.java.WebsitesMapper.selectBlog";
        Object ed = sqlSession.selectOne(eo,5);
        System.out.println(ed);
        sqlSession.close();
    }

    //执行更新操作
    public static void UpdateWebsites() throws IOException {
//加载配置文件，目的为访问数据库
        //select语句
        InputStream re = Resources.getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(re) ;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String eo = "src.main.java.WebsitesMapper.UpdateWebsites";
        Object ed = sqlSession.update(eo,2);
        System.out.println(ed);
        sqlSession.close();
    }
    //执行插入操作
    public static void InsertWebsites () throws IOException {
        InputStream re = Resources.getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(re) ;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String eo = "src.main.java.WebsitesMapper.AddWebsites";
        Websites websites = new Websites("z7","wd.com",400,"cnn");
        Object ed = sqlSession.insert(eo,websites);
        sqlSession.commit();
        System.out.println(ed);
        System.out.println(websites.getId());
        sqlSession.close();
    }

    //执行删除操作
    public static void DeleteWebsites () throws IOException {
        InputStream re = Resources.getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(re) ;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String statement = "src.main.java.WebsitesMapper.DeleteWebsites";
        Object ed = sqlSession.delete(statement,2);
        sqlSession.commit();
        System.out.println(ed);
        sqlSession.close();
    }


    public static void main(String[] args) throws IOException {
//        UpdateWebsites();
//        InsertWebsites();
//        DeleteWebsites();
        SelectWebsites ();
    }
}