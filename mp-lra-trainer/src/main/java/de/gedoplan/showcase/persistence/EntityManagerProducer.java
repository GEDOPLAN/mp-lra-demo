package de.gedoplan.showcase.persistence;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

// This class will be ignored in Quarkus deployments (see application.properties)
@ApplicationScoped
public class EntityManagerProducer {
  @PersistenceContext
  @Produces
  EntityManager entityManager;
}
