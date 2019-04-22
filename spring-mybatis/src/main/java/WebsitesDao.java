import java.util.List;
import java.util.Map;

public interface WebsitesDao {

    @Select("select * from websites where id = 5")
    public List<Map<String,Object>> query();
    
    @Delete("delete from websites where id = 2")
    public List<Map<String,Object>> excuteUpdate();
    
    @Insert("insert into websites(id,name,alaxe,country) values (null,lisi,200,Cn)")
    public List<Map<String,Object>> query();
    
    @Update("update websites set name = sunxiaochuan , alaxe = 300 , country = ZN where id = 4")
    public List<Map<String,Object>> update();
}
