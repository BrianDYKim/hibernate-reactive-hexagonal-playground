// Hibernate Reactive에 관여하는 모듈 이름들
val vertxVersion = "4.3.3"
val hibernateReactiveVersion = "1.1.7.Final"

dependencies {

    api(project(":ports:repository"))

    // Hibernate Reactive Dependencies
    implementation("org.hibernate.reactive:hibernate-reactive-core:$hibernateReactiveVersion")
    implementation("io.vertx:vertx-mysql-client:$vertxVersion")
    implementation("org.hibernate:hibernate-jpamodelgen")

    // quarkus
    implementation("io.quarkus:quarkus-spring-di")
}