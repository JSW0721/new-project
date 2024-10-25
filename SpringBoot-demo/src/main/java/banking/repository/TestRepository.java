package banking.repository;

import banking.DTO.TestDTO;

import java.util.List;

public interface TestRepository {
    List<TestDTO> selectPostWithCount();
}
