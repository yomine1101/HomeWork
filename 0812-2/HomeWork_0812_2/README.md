# HomeWork_0812_2
###### tags: `Spring Boot` `Angular` 

---

~~刪除跟增加的 id 有沒有自動加值跟排序的問題，尚未修改完全~~

**已完成自動生成 id 功能**

    @GeneratedValue(strategy = GenerationType.IDENTITY)
😢 ps. 流水號 id 有弊病 若刪除 id: 6 再 add User 的時候 id 會從 7 開始（而不是6）

## Load User View
**查詢所有使用者**
![](https://i.imgur.com/1b8wI4v.jpg)


---
## Add User View
**增加使用者**
![](https://i.imgur.com/LMF7omC.jpg)


---
## Update User View
**更新使用者**
![](https://i.imgur.com/bh6vCSP.jpg)

