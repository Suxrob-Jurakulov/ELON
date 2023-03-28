package com.company.mapper;

import com.company.dto.PostDTO;
import com.company.dto.UserDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostListMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        PostDTO post = new PostDTO();
        post.setTitle(rs.getString("mahsulot_nomi"));
        post.setPrice(rs.getDouble("price"));
        post.setDescription(rs.getString("description"));
        post.setCreated_at(rs.getTimestamp("created_at"));

        UserDTO user = new UserDTO();
        user.setName(rs.getString("sotuvchi"));
        user.setUsername(rs.getString("username"));
        user.setPhone(rs.getString("s_phone"));

        post.setUser(user);
        return post;
    }
}
