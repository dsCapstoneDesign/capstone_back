package com.example.emotionbot.api.challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChallengeOption {
    WALKING("하루 30분 산책하기");
    private String option;
}
