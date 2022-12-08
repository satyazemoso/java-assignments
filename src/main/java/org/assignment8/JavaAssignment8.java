package org.assignment8;

public class JavaAssignment8 {

    public static void main(String args[]){
       Person person = new Person();
        try {
            person.run();
        } catch (Exception e) {
            System.out.println("inside exception block ,Exception= "+e.getClass());
        }
        finally {
            System.out.println("finally block called");
        }
    }

}
