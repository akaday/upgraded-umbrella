rootProject.name = "declaring-project-dependencies"
include("utils", "api", "web-service")

// tag::accessors[]
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
// end::accessors[]