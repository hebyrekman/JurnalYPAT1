package Man.ConfigDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection extends Connect {
    //��������� ���������� ��� ������ � ����� ������ Connection
    static Connection dbConnect;//������� ��������� ������ Connection �� ����� dbConnect

    //��������� �������
    //�� ����� ������ ���������� ����������� � ���� ������
    public static Connection getDbConnect() throws ClassNotFoundException, SQLException {
        String connectorString = "jdbc:mysql://192.168.3.211/rybin1_jurYPAT";
        Class.forName("com.mysql.cj.jdbc.Driver");
        //���� ����������� ����� �����
        dbConnect = DriverManager.getConnection(connectorString,userName08,password08);
        System.out.println("������� ���������� � ���� ������!!!");
        return dbConnect;
    }
}
