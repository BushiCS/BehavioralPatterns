package org.example.command;

public class Demo {
    public static void main(String[] args) {
        Database database = new Database();
        JavaDeveloper javaDeveloper = new JavaDeveloper(
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database),
                new InsertCommand(database));

        javaDeveloper.selectRecord();
        javaDeveloper.updateRecord();
        javaDeveloper.insertRecord();
        javaDeveloper.deleteRecord();

    }
}
