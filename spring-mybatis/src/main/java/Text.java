import com.dao.Appconfig;

public class Text {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        WebsitesService service = annotationConfigApplicationContext.getBean(WebsitesService.class);
        service.query();
    }
}