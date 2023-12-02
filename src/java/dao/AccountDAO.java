package dao;

import context.DBUtils;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KhoaHD7621
 */
public class AccountDAO {

    private static final String GET_AN_ACCOUNT = "SELECT UserID, username, Password, name, Phone, email, Role FROM Accounts WHERE Email = ? AND Password = ?;";

    private static final String INSERT_ACCOUNT = "INSERT INTO Accounts (email, password, fullname, phone, status, role) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String GET_ACCOUNT_INFO_BY_EMAIL = "SELECT UserID, Email, Password, FullName, Phone, Status, Role FROM Accounts WHERE Email = ?";

    private static final String GET_AN_ACCOUNT_BY_TOKEN = "SELECT AccID, Email, Password, FullName, Phone, Status, Role FROM Accounts WHERE token = ?";
    private static final String UPDATE_TOKEN = "UPDATE Accounts Set token = ? WHERE email = ?";
    private static final String VALID_TOKEN = "SELECT AccID, Email, Password, FullName, Phone, Status, Role FROM Accounts WHERE token = ?";
    private static final String GET_ROLE_ACCOUNT_BY_TOKEN = "SELECT role FROM Accounts WHERE token = ?";

    public int getRoleAccountByToken(String token) throws SQLException {
        int role = 0;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(GET_ROLE_ACCOUNT_BY_TOKEN);
                stm.setString(1, token);
                rs = stm.executeQuery();
                if (rs.next()) {
                    role = rs.getInt("role");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return role;
    }

    public boolean validToken(String token) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement psm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                psm = conn.prepareStatement(VALID_TOKEN);
                psm.setString(1, token);
                rs = psm.executeQuery();
                if (rs.next()) {
                    check = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (psm != null) {
                psm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean updateToken(String token, String email) throws SQLException {
        boolean check = true;
        Connection conn = null;
        PreparedStatement psm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                psm = conn.prepareStatement(UPDATE_TOKEN);
                psm.setString(1, token);
                psm.setString(2, email);
                check = psm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (psm != null) {
                psm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean getAccountByEmail(String email) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(GET_ACCOUNT_INFO_BY_EMAIL);
                stm.setString(1, email);
                rs = stm.executeQuery();
                if (rs.next()) {
                    check = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public Account getAccount(String email, String password) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Account acc = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(GET_AN_ACCOUNT);
                stm.setString(1, email);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int AccId = rs.getInt("AccID");
                    String Email = rs.getString("Email");
                    String FullName = rs.getString("FullName");
                    String Phone = rs.getString("Phone");
                    int Status = rs.getInt("Status");
                    int Role = rs.getInt("Role");
                    // acc = new Account(AccId, Email, "******", FullName, Status, Phone, Role);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return acc;
    }

    public Account getAccount(String token) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Account acc = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(GET_AN_ACCOUNT_BY_TOKEN);
                stm.setString(1, token);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int AccId = rs.getInt("AccID");
                    String Email = rs.getString("Email");
                    String Password = rs.getString("Password");
                    String FullName = rs.getString("FullName");
                    String Phone = rs.getString("Phone");
                    int Status = rs.getInt("Status");
                    int Role = rs.getInt("Role");
                    //acc = new Account(AccId, Email, Password, FullName, Status, Phone, Role);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return acc;
    }

    public Account getAccountInfoByEmail(String email) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Account acc = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(GET_ACCOUNT_INFO_BY_EMAIL);
                stm.setString(1, email);
                rs = stm.executeQuery();
                if (rs.next()) {
                    int AccId = rs.getInt("AccID");
                    String Email = rs.getString("Email");
                    String Password = rs.getString("Password");
                    String FullName = rs.getString("FullName");
                    String Phone = rs.getString("Phone");
                    int Status = rs.getInt("Status");
                    int Role = rs.getInt("Role");
                    //  acc = new Account(AccId, Email, Password, FullName, Status, Phone, Role);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return acc;
    }

    public boolean insertAccount(String newEmail, String newPassword, String newFullname, String newPhone, int newStatus, int newRole) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                stm = conn.prepareStatement(INSERT_ACCOUNT);
                stm.setString(1, newEmail);
                stm.setString(2, newPassword);
                stm.setString(3, newFullname);
                stm.setString(4, newPhone);
                stm.setInt(5, newStatus);
                stm.setInt(6, newRole);
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }


}
