package com.mainapp.entity;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection="mdb_otm_player")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class PlayerEntity {
	
	@Id
	@NonNull
	private Integer pid;
	@NonNull
	private String pname;
	@NonNull
	private String paddrs;
	@NonNull
	private Integer page;
	private Set<SportEntity> sportsInfo;
	private Map<String,MedalEntity> medalsInfo;
	@Override
	public String toString() {
		return "PlayerEntity [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", page=" + page + "]";
	}
	
}
