package Man.ConfigDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection extends Connect {
    //использую библиотеку дл€ работы с Ѕзами данных Connection
    static Connection dbConnect;//ќбь€вил экземпл€р класса Connection по имени dbConnect

    //подключаю драйвер
    //то метод вывода результата подключени€ к базе данных
    public static Connection getDbConnect() throws ClassNotFoundException, SQLException {
        String connectorString = "jdbc:mysql://192.168.3.211/rybin1_jurYPAT";
        Class.forName("com.mysql.cj.jdbc.Driver");
        //само подключение через метод
        dbConnect = DriverManager.getConnection(connectorString,userName08,password08);
        System.out.println("спешное подклчение к базе данных!!!");
        return dbConnect;
    }
}
