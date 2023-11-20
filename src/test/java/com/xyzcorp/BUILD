java_test(
    name = "vs_code_bazel_tests",
    srcs = glob(["*.java"]),
    test_class = "com.xyzcorp.EmployeeTest",
    deps = [
        "//src/main/java/com/xyzcorp:vs_code_bazel_runner",
        "@maven//:junit_junit",
        "@maven//:org_assertj_assertj_core",
    ]
)