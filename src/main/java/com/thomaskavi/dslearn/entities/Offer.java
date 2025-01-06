package com.thomaskavi.dslearn.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_offer")
public class Offer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String edition;
  private Instant startMoment;
  private Instant endMoment;

  @ManyToOne
  @JoinColumn(name = "course_id")
  private Course course;

  public Offer() {
  }

  public Offer(Long id, String edition, Instant startMoment, Instant endMoment, Course course) {
    this.id = id;
    this.edition = edition;
    this.startMoment = startMoment;
    this.endMoment = endMoment;
    this.course = course;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public Instant getStartMoment() {
    return startMoment;
  }

  public void setStartMoment(Instant startMoment) {
    this.startMoment = startMoment;
  }

  public Instant getEndMoment() {
    return endMoment;
  }

  public void setEndMoment(Instant endMoment) {
    this.endMoment = endMoment;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Offer other = (Offer) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
