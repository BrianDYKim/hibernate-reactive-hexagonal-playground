// Hibernate Reactive에 관여하는 모듈 이름들
val hibernateReactiveVersion = "1.1.7.Final"

dependencies {
    // Hibernate Reactive Dependencies
    implementation("org.hibernate.reactive:hibernate-reactive-core:$hibernateReactiveVersion")
    implementation("org.hibernate:hibernate-jpamodelgen")
}