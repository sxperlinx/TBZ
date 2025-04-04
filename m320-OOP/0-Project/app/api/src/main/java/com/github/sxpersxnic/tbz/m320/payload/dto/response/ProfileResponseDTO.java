package com.github.sxpersxnic.tbz.m320.payload.dto.response;

import com.github.sxpersxnic.tbz.m320.lib.abstracts.ResponseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/// Response DTO for profile
/// @author sxpersxnic
@Data
@EqualsAndHashCode(callSuper = true)
public class ProfileResponseDTO extends ResponseDTO {
    private String username;
    private String profilePicture;
    private List<QuestionResponseDTO> questions;
    private List<AnswerResponseDTO> answers;
}
