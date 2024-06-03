package com.attica.athens.domain.agoraUser.exception;

import com.attica.athens.domain.common.advice.CustomException;
import com.attica.athens.domain.common.advice.ErrorCode;
import org.springframework.http.HttpStatus;

public class AlreadyVotedException extends CustomException {

    public AlreadyVotedException() {
        super(
                HttpStatus.BAD_REQUEST,
                ErrorCode.WRONG_REQUEST_TRANSMISSION,
                "User has already voted for ending the agora"
        );
    }
}
