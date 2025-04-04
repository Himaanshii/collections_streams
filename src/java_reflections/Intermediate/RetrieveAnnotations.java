package java_reflections.Intermediate;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}
@Author(name = "Author name")
class name{
    public String name;
    name(String name){
        this.name=name;
    }
}
public class RetrieveAnnotations {
    public static void main(String[] args) {

        Class<name> obj = name.class;


        if (obj.isAnnotationPresent(Author.class)) {

            Author author = obj.getAnnotation(Author.class);


            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}
