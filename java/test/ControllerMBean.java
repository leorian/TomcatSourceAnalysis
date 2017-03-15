package test;

public interface ControllerMBean {
    //属性  
    void setName(String name);

    String getName();


    //操作  

    /**
     * 获取当前信息
     *
     * @return
     */
    String status();

    void start();

    void stop();

}  