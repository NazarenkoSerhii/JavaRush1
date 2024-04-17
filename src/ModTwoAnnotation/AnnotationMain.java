package ModTwoAnnotation;

public class AnnotationMain {
    public static void main(String[] args) {
        new User();
//        processXML("path");
    }

    @SuppressWarnings("deprecation")                                          //выключение deprecated
    public static void processXML(String path) {
        System.out.println(path);
        XML_Message xmlMessage = new XML_Message();
    }
}
