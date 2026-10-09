# LeetCode & Interview Progress

## Scoring Rubric

Each completed problem is scored out of 100 during the AI-interviewer simulation:

| **Metric**          | **Weight** | **Measures**                                |
| ------------------- | ---------: | ------------------------------------------- |
| **Correctness**     |         30 | Correct implementation + edge cases         |
| **Independence**    |         25 | How much was solved without hints           |
| **Problem Solving** |         20 | Clarification, approach, reasoning, dry run |
| **Complexity**      |         15 | Time / space understanding                  |
| **Speed / Fluency** |         10 | Interview pace and implementation fluency   |

### Independence bands

| **Level**     | **Points** | **Meaning**                                                  |
| ------------- | ---------: | ------------------------------------------------------------ |
| Independent   |      21-25 | Derived the approach and wrote the code without hints        |
| Guided        |      11-20 | Needed a nudge on the approach or on translating to code     |
| With Help     |       0-10 | Solution direction or code was largely provided              |

### Speed bands (time from reading the problem to a passing solution)

| **Difficulty** | **On pace (8-10)** | **Slow (4-7)** | **Very slow (0-3)** |
| -------------- | -----------------: | -------------: | ------------------: |
| Easy           |            ≤ 15 min |    16-25 min   |           > 25 min  |
| Medium         |            ≤ 30 min |    31-45 min   |           > 45 min  |
| Hard           |            ≤ 45 min |    46-70 min   |           > 70 min  |

*Always record the **Minutes** column. A speed score without a recorded time is a guess.*

### Overall Mastery

Mastery is a slower-moving estimate. Update it **once a week** as the difficulty-weighted average of the last 5 scored problems (Easy = 1, Medium = 2, Hard = 3). It stays at **Baseline** until 5 problems are scored, because one Easy problem is not enough data.

---

## Problem Log

| **Date**   | **Problem**             | **Topic** | **Difficulty** | **Min** | **Independence** | **Time / Space**  | **Status**     | **Score** | **LeetCode Result**                                       | **Notes / Commit Link**                                                      |
| ---------- | ----------------------- | --------- | -------------- | ------: | ---------------- | ----------------- | -------------- | --------: | --------------------------------------------------------- | ---------------------------------------------------------------------------- |
| 2026-10-04 | Merge Sorted Array #88  | Arrays    | Easy           |       — | Independent      | `O(m+n)` / `O(1)` | ✅ Accepted     |    **89** | `0 ms` · `100.00% runtime` · `43.83 MB` · `46.57% memory` | Reverse in-place merge; Java code. Time unrecorded; speed score estimated.   |
| 2026-10-04 | Sort Colors #75         | Arrays    | Medium         |       — | —                | —                 | 🟡 In Progress |         — | —                                                         | —                                                                            |

---

## Score Breakdown

| **Date**   | **Problem**            | **Correctness (30)** | **Independence (25)** | **Reasoning (20)** | **Complexity (15)** | **Speed (10)** | **Total** |
| ---------- | ---------------------- | -------------------: | --------------------: | -----------------: | ------------------: | -------------: | --------: |
| 2026-10-04 | Merge Sorted Array #88 |                   30 |                    23 |                 18 |                  15 |              3 |    **89** |

---

## Mastery Trend

| **Week of** | **Problems scored** | **Weighted avg** | **Mastery**  |
| ----------- | ------------------: | ---------------: | ------------ |
| 2026-10-04  |                   1 |               89 | **Baseline** |

---

## Interview Coverage & Targets

Problems progressively cover major DSA patterns across Easy, Medium, and Hard tiers, incorporating **Google-style** and **Jane Street-style** deep-reasoning problems. The target pattern is kept hidden during solving and finalized post-submission.

### Targeted Interview Process Flow:
1. **Clarify & Restate:** Ask questions, establish constraints, and define edge cases.
2. **Brainstorm:** Present brute-force, find bottlenecks, and derive optimization.
3. **Plan:** Choose data structures/algorithms, write pseudocode, and dry run manually.
4. **Analyze:** State time and space complexity before writing syntax.
5. **Implement & Test:** Write independent Java code on LeetCode, submit, and commit.
