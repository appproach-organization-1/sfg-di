package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

       ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
       PropertyInjectedController pic=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
       ConstructorInjectedController cic=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
       I18nController i18nController=(I18nController)ctx.getBean("i18nController");

        System.out.println("----i18n------");
        System.out.println(i18nController.sayHello());

       System.out.println("----property------");
       System.out.println(pic.sayHello());
       System.out.println("----Constructor------");
        System.out.println(cic.sayHello());

    }

}
