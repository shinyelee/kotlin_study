// Coroutine(코루틴) //

// 메인 루틴과 별도로 진행 가능한 루틴
// 개발자가 루틴의 실행과 종료를 마음대로 제어할 수 있는 단위
// 사용시 아래와 같이 임포트

//import kotlinx.coroutines.*
//Kotlin: Unresolved reference: kotlinx

// 검색해보니 인텔리제이의 코틀린 파일에는 냅다 임포트 한다고 쓸 수 있는 게 아닌 듯 함
// 실습은 웹(https://play.kotlinlang.org)으로 하고 여기선 이론만 정리하겠음



fun main() {

    // 제어 범위와 실행 범위(스코프) 지정 가능 //

    // Global Scope(글로벌 스코프)
    // -> 프로그램의 어디서나 제어 동작이 가능한 코루틴의 범위

    // Coroutine Scope(코루틴 스코프)
    // -> 특정한 목적의 dispatcher(디스패처)를 지정해 제어 및 동작이 가능한 새로운 코루틴 범위 생성



    // Coroutine의 Dispatcher(코루틴 스코프를 만들 때 적용 가능한 디스패처) //

    // Dispatchers.Default -> 기본적인 백그라운드 동작
    // Dispatchers.IO -> IO에 최적화 된 동작
    // Dispatchers.Main -> 메인(UI) 스레드에서 동작
    // 일부 디스패처 지원 안되는 경우도 있으니 지원되는 플랫폼에 따라 사용해야 함



    // 새로운 코루틴 생성 //

    // launch -> 반환값이 없는 Job 객체
    // async -> 반환값이 있는 Deffered 객체



    // 루틴의 대기를 위한 추가적인 함수들 //

    // delay(millisecond: Long) -> millisecond 단위로 루틴을 잠시 대기시키는 함수
    // Job.join() -> Job의 실행이 끝날 때까지 대기하는 함수
    // Deferred.await() -> Deffered의 실행이 끝날 때까지 대기하는 함수(Deffered의 결과도 반환)
    // 코루틴 내부 또는 runBlocking{}과 같은 루틴의 대기가 가능한 구문 안에서만 동작 가능



    // cancel() //

    // 코루틴에 캔슬을 걸어주면 다음 두 가지 조건이 발생하며 코루틴을 중단
    // 1. 코루틴 내부의 delay() 함수 또는 yield() 함수가 사용된 위치까지 수행 후 종료
    // 2. cancel()로 인해 속성인 isActive가 false가 됨 -> 수동 종료

}









