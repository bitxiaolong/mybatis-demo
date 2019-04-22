package cn.jbit.spring101301.dao;

public class JdbcTemplateDemo {

    /**
     * 使用spring jdbctemplate查询个数
     */
    @Test
    public void testJdbcTemplateFindCount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ITempDao tempDao = (ITempDao) context.getBean("tempdao");
        System.out.println(tempDao.findCount());
    }


    /**
     * 使用spring jdbctemplate删除
     */
    @Test
    public void testJdbcTemplateDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ITempDao tempDao = (ITempDao) context.getBean("tempdao");
        tempDao.delete(2);
    }


    /**
     * 使用spring jdbctemplate修改
     */
    @Test
    public void testJdbcTemplateUpate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ITempDao tempDao = (ITempDao) context.getBean("tempdao");
        Temp temp = new Temp();
        temp.setTempId(1);
        temp.setTempName("liubei");
        tempDao.update(temp);
    }

    /**
     * 使用spring jdbctemplate添加数据
     */
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ITempDao tempDao = (ITempDao) context.getBean("tempdao");
        Temp temp = new Temp();
        temp.setTempId(8);
        temp.setTempName("guanyu");
        tempDao.save(temp);
    }
}