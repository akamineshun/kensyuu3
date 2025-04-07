package com.example.demo3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Person {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * <p>項目名：名前</p>
     * <p>必須入力かつ、最大10文字まで</p>
     */
    @NotBlank
    @Size(max=10)
    private String name;

    /**
     * <p>項目名：年齢</p>
     * <p>1以上</p>
     */
    @NotNull
    @Min(1)
    @Max(120)
    private Integer age;

    /**
     * <p>項目名：職業</p>
     * <p>必須入力かつ、最大10文字まで</p>
     */
    @NotBlank
    @Size(max=10)
    private String business;

    /**
     * <p>項目名：メールアドレス</p>
     * <p>条件：必須入力かつ、最大64文字まで</p>
     */
    @NotBlank
    @Email
    @Size(max=64)
    private String email;
}