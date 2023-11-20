# vscode-training-bazel
Platform for using bazel in vscode training

## Getting Started

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/github.com/dhinojosa/vscode-training-bazel)

## Running some examples

```sh
$ bazel query "//src/main/java/com/xyzcorp:*"
$ bazel build "//src/main/java/com/xyzcorp:vs_code_bazel_runner"
$ bazel query "//src/test/java/com/xyzcorp:*"
$ bazel test "//src/test/java/com/xyzcorp:vs_code_bazel_tests"
```