package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "titans")
public class Titan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "health")
	private int health;
	@ManyToOne
	@JoinColumn(name = "weapon_id", referencedColumnName = "id")
	private TitanWeapon weapon;
	@Column(name = "warp")
	private boolean warp;
	@Column(name = "tactic")
	private String tactic;

	@OneToMany(mappedBy = "titan")
	List<Pilot> pilots;
	@Column(name = "core")
	@Enumerated(value = EnumType.STRING)
	private Core core;

	public enum Core {
		shield, damage, dash
	}
}
