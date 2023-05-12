# sunsetexperience
An intuitive app to manage your temporary housing

## Arquitetura

### Modern App Architecture (MVVM + Clean Architecture)
This Modern App Architecture encourages using the following techniques, among others:

> - A reactive and layered architecture.</br>
> - Unidirectional Data Flow (UDF) in all layers of the app.</br>
> - A UI layer with state holders to manage the complexity of the UI.</br>
> - Coroutines and flows.</br>
> - Dependency injection best practices.</br>

Above is the Clean Architecture flow that shows how the data is requested until data is presented. 
Clean Architecture divided into 3 layers: (Presentation - Domain - Data) 

<p align="start">
  <img src="art_arch_mvvm.png" width="1024" title="mvvm">
</p>

### Modules
Above is shown the multiples modules
> The concept this project is based feature module

<p align="start">
  <img src="art_arch.png" width="1024" title="modules">
</p>
