package com.abcode.catalogovideo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryTests {

    @Test
    public void createCategoryWithNames() throws Exception {
        final Category entity = new Category(
                "Name 1",
                "description 2"
        );

        assertNotNull(entity);
        Assertions.assertEquals(entity.getName(), "Name 1");
    }
}
