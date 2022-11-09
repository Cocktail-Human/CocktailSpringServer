package com.springserver.cocktailspringserver.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter //get 함수 자동 생성
@MappedSuperclass   //JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들(createdDate,modifiedData)도 칼럼으로 인식하도록 함
@EntityListeners(AuditingEntityListener.class)  //BaseTimeEntity 클래스에 Auditing 기능 포함
public abstract class BaseTimeEntity {

    @CreatedDate  //Entity 생성시 시간 자동 저장
    private LocalDateTime createData;   //만들때 시간, 생성시간

    @LastModifiedDate   //Entity 수정시 시간 자동 저장
    private LocalDateTime modifiedData; //수정할때 시간, 수정시간

}
