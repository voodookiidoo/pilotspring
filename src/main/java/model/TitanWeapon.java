package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
@Table(name = "titan_weapon")
@Getter
@Setter
@Accessors(chain = true)
public class TitanWeapon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "weapon_name")
	private String name;
	@OneToMany(mappedBy = "weapon")
	private List<Titan> titans;
}
