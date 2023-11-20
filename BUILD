java_binary(
    name = "vs_code_bazel",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "com.xyzcorp.Runner",
)

java_library(
    name = "java_test_deps",
    exports = [
        "@maven//:junit_junit",
        "@maven//:org_assertj_assertj_core",
    ],
)