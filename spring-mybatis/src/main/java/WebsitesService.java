@Component
public class WebsitesService {

    @Autowired
    WebsitesDao dao;
    public void query(){
        System.out.println(dao.query());
    }
}