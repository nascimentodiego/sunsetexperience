# sunsetexperience
An intuitive app to manage your temporary housing

[![Build Status](https://app.bitrise.io/app/ddde351c-414e-466a-a833-410ae2d9f034/status.svg?token=YomYQxlUEfrBqUGUMA60zw&branch=develop)](https://app.bitrise.io/app/ddde351c-414e-466a-a833-410ae2d9f034) [![codecov](https://codecov.io/github/nascimentodiego/sunsetexperience/branch/develop/graph/badge.svg?token=TRM8RI931Y)](https://codecov.io/github/nascimentodiego/sunsetexperience)

## Architecture

### Modern App Architecture (MVVM + Clean Architecture)
This project are using the following google techniques recommendations:

> - A reactive and layered architecture.</br>
> - Unidirectional Data Flow (UDF) in all layers of the app.</br>
> - A UI layer with state holders to manage the complexity of the UI.</br>
> - Coroutines and flows.</br>
> - Dependency injection best practices.</br>

Below is the Clean Architecture flow that shows how the data is requested until data is presented. 
Clean Architecture divided into 3 layers: (Presentation - Domain - Data) 

<p align="start">
  <img src="art_arch_mvvm.png" width="1024" title="mvvm">
</p>

### Modules
Below is shown the multiples modules
> The concept of this project is based feature module, can you see at diagram below:

<p align="start">
  <img src="art_arch.png" width="1024" title="modules">
</p>


### Setup
Pre push Git Hooks
> Add file pre-push at directory <b>.git/hooks<b/> to configure ktlint and deteKt checks before push

<p align="start">
  <img src="git-pre-push-hooks.jpg" width="1024" title="pre-push">
</p>

# ci teste