package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * 강의차시정보 엔티티
 * @author 신민기
 */
@Entity
@Data
@Table(name = "lect_nth")
public class LectNth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nth_id")
    private Long nthId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lect_id")
    private LectInfo lectInfo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conts_no")
    private LmsConts lmsConts;

    @Column(name = "nth_name")
    private String nthName;

    @Column(name = "nth_sequence")
    private Long nthSequence;

    public LectNth(LectInfo lectInfo, LmsConts lmsConts, String nthName, Long nthSequence) {
        this.lectInfo = lectInfo;
        this.lmsConts = lmsConts;
        this.nthName = nthName;
        this.nthSequence = nthSequence;
    }
}
