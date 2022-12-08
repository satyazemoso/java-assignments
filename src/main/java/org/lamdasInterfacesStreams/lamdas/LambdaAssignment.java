package org.lamdasInterfacesStreams.lamdas;

public class LambdaAssignment {
    public interface Email {
        void createEmail(String name);
    }
    public void test(String testname){
        System.out.println("1234444");
        Email email = (foo) -> System.out.println("Hello"+foo+testname);
        email.createEmail("baby");
    }
    public static void main(String args[]){
        //Email temail = (String s) -> s+"@gmail.com";
        //System.out.println(temail.createEmail("satya"));
         new LambdaAssignment().test("gopal ganta");
    }
}
