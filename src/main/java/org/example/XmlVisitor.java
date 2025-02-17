package org.example;

public class XmlVisitor implements Visitor{

    @Override
    public String exportStudent(Student student) {

        String xmlResponse = "<student>\n";
        xmlResponse += "<name>" + student.getName() + "</name>\n";
        xmlResponse += "<age>" + student.getAge() + "</age>\n";
        xmlResponse += "</student>";

        return xmlResponse;
    }

}
