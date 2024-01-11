package lk.ijse.dao.custom;

import lk.ijse.dto.SignUpDto;
import lk.ijse.entity.SignUp;

import java.sql.SQLException;

public interface SignUpDAO {
    boolean createAccount(final SignUp entity) throws SQLException;
}
