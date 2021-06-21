package com.taskagile.app.infrastructure;

import org.hibernate.Session;

import javax.persistence.EntityManager;

abstract class HibernateSupport {

  EntityManager entityManager;

  HibernateSupport(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  Session getSession() {
    return entityManager.unwrap(Session.class);
  }

}
