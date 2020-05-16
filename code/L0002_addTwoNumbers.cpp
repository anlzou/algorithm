/***
 * @Date        : 2020-05-04 20:47:46
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-16 11:41:18
 * @FilePath    : \algorithm\code\L0002_addTwoNumbers_2.cpp
 * @Describe    :
 */
/**
 * //Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next() {}
};

class Solution {
   public:
    //方法一
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode *p1 = l1, *p2 = l2;
        ListNode* dummyHead = new ListNode(-1);
        ListNode* cur = dummyHead;
        int carried = 0;
        while (p1 || p2) {
            int a = p1 ? p1->val : 0;
            int b = p2 ? p2->val : 0;
            cur->next = new ListNode((a + b + carried) % 10);
            carried = (a + b + carried) / 10;

            cur = cur->next;
            p1 = p1 ? p1->next : 0;
            p2 = p2 ? p2->next : 0;
        }

        cur->next = carried ? new ListNode(1) : 0;
        ListNode* ret = dummyHead->next;
        delete dummyHead;
        return ret;
    }

    // 方法二
    ListNode* addTwoNumbers2(ListNode* l1, ListNode* l2) {
        ListNode* ret = nullptr;
        ListNode* cur = nullptr;
        int carry = 0;
        while (l1 != nullptr || l2 != nullptr || carry != 0) {
            carry +=
                (l1 == nullptr ? 0 : l1->val) + (l2 == nullptr ? 0 : l2->val);
            auto temp = new ListNode(carry % 10);
            carry /= 10;
            if (ret == nullptr) {
                ret = temp;
                cur = ret;
            } else {
                cur->next = temp;
                cur = cur->next;
            }
            l1 = l1 == nullptr ? nullptr : l1->next;
            l2 = l2 == nullptr ? nullptr : l2->next;
        }
        return ret;
    }

    //递归方法一：普通递归
    ListNode* addTwoNumbers3(ListNode* l1, ListNode* l2) {
        return addTwoNumbers3(l1, l2, 0);
    }

   private:
    ListNode* addTwoNumbers3(ListNode* l1, ListNode* l2, int carry) {
        if (l1 == nullptr && l2 == nullptr && carry == 0) return nullptr;
        carry += (l1 == nullptr ? 0 : l1->val) + (l2 == nullptr ? 0 : l2->val);
        auto ret = new ListNode(carry % 10);
        ret->next = addTwoNumbers3(l1 == nullptr ? l1 : l1->next,
                                   l2 == nullptr ? l2 : l2->next, carry / 10);
        return ret;
    }

    //递归方法二：（类似）尾递归
    ListNode* addTwoNumbers4(ListNode* l1, ListNode* l2) {
        ListNode* head = nullptr;
        addTwoNumbers4(head, nullptr, l1, l2, 0);
        return head;
    }

   private:
    void addTwoNumbers4(ListNode*& head, ListNode* cur, ListNode* l1,
                        ListNode* l2, int carry) {
        if (l1 == nullptr && l2 == nullptr && carry == 0) return;
        carry += (l1 == nullptr ? 0 : l1->val) + (l2 == nullptr ? 0 : l2->val);
        auto temp = new ListNode(carry % 10);
        if (cur == nullptr) {
            head = temp;
            cur = head;
        } else {
            cur->next = temp;
            cur = cur->next;
        }
        addTwoNumbers4(head, cur, l1 == nullptr ? l1 : l1->next,
                       l2 == nullptr ? l2 : l2->next, carry / 10);
    }
};