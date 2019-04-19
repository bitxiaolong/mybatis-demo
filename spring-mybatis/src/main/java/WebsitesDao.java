import java.util.List;
import java.util.Map;

public interface WebsitesDao {

    @Select("select * from websites where id = 5")
    public List<Map<String,Object>> query();
}