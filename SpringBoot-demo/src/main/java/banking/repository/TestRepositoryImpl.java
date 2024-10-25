package banking.repository;

import banking.DTO.TestDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestRepositoryImpl implements TestRepository {
    @Autowired
    private JPAQueryFactory jpaqf;
    @Override
    public List<TestDTO> selectPostWithCount() {
        return List.of();
    }
}
