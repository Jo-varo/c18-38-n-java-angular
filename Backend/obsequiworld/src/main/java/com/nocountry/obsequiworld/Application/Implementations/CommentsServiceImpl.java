package com.nocountry.obsequiworld.Application.Implementations;

import com.nocountry.obsequiworld.Domain.Dtos.Comments.CommentsCreateDto;
import com.nocountry.obsequiworld.Domain.Dtos.Comments.CommentsReadDto;
import com.nocountry.obsequiworld.Domain.Dtos.Mappers.GeneralMapper;
import com.nocountry.obsequiworld.Domain.Entities.Comments;
import com.nocountry.obsequiworld.Domain.Repositories.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentsServiceImpl extends
        CrudImplementation<Comments, Long, CommentsCreateDto, CommentsReadDto>{
    public CommentsServiceImpl(CrudRepository<Comments, Long> crudRepository, GeneralMapper<Comments, CommentsCreateDto, CommentsReadDto> mapper) {
        super(crudRepository, mapper);
    }

    @Transactional
    @Override
    public void createEntity(CommentsCreateDto commentsCreateDto) throws Exception {
        super.createEntity(commentsCreateDto);
    }

    @Override
    public List<CommentsReadDto> getEntitiesList() {
        return super.getEntitiesList();
    }
}
