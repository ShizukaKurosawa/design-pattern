### Facadeパターン
※ Facade（ファサード）パターン<br>

複雑な処理をまとめて、インターフェースとして公開する。<br>

1. 利用シーン・メリット<br>

  Facadeパターンは以下の場合に利用する。<br>
    - 複数の処理をまとめる場合<br>
    - よく利用する処理をまとめる場合<br>
  クラスとクライアント間の結合度合いを弱めたい場合<br>


2. サンプルコードの解説<br>
  
- BankSystem<br>
  銀行のシステムを表すクラス。<br>
  ここに沢山のクラスが存在する。<br>

- BankManager<br>
  BankSystemのメソッドをまとめて、APIを作成するクラス。<br>
  ここがFacadeクラスになる。<br>

- Account<br>
  銀行口座を表すクラス。<br>

- Main<br>
  BankManagerにローンを組む依頼を出す。<br>

Facadeパターンでは、以下クラスを作成する。<br>

- Class1〜3<br>
  沢山のメソッドが用意されている。<br>

- Facade<br>
  複数のクラスのメソッドをまとめて、外部に公開するAPIを用意する。<br>

- Client<br>
  Facadeクラスのメソッドを呼び出す。<br>


3. 他のパターンとの関連<br>

- Abstract Factoryパターン<br>
  Abstract Factoryパターンは、オブジェクト生成という複雑な作業に関するFacadeパターンと見ることができる。<br>

- Singletonパターン<br>
  FacadeクラスはSinglitonとして作成されることがある。<br>

- Mediatorパターン<br>
  既存クラスの機能を抽出するという点で、MediatorパターンはFacadeパターンに似ている。<br>
  Mediatorパターンでは、MediatorとColleagueとの間でやりとりが行われる。<br>
  Facadeパターンでは、Facadeが各クラスの処理wを勝手にまとめる。<br>


4. まとめ<br>

  よく利用する処理、複雑な処理をAPIとしてまとめる。<br>

