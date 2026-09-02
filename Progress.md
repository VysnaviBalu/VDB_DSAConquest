# Progress Log

## Tracks
- **freeCodeCamp** — 49-hour DSA course (structured, pattern-based)
- **Code io Tamil** — DSA concepts video series (foundational, implementation-focused)

## Scoring Rubric

Each session is scored out of 100, split across 4 weighted components:

| Component | Weight | What it measures |
|---|---|---|
| **Correctness** | 30 | Did the logic work as intended, or were there bugs (even subtle ones like off-by-one, wrong direction, unreliable checks)? |
| **Independence** | 30 | How much was built/solved unaided vs. needing hints or correction? |
| **Complexity Awareness** | 25 | Did you identify/reason about time & space complexity (Big-O) without being told? |
| **Speed/Fluency** | 15 | Rough timing — are you approaching interview pace, or still exploratory? (Low weight early on, since this matters more once fundamentals are solid.) |

**Overall mastery** (the running "how close to interview-ready" number) is a separate, slower-moving estimate — it accounts for *breadth* of topics covered (arrays, strings, trees, graphs, DP, etc. — dozens of areas), not just how well a single session went. Early sessions will score low here even with a strong session score, simply because so much ground is still uncovered.

---

## Log

### 2026-08-11 — freeCodeCamp
**Pattern/topic:** Big-O fundamentals (O(1), O(log n), O(n)), array intersection (brute force vs HashSet vs hybrid)
**Video/course time:** ~23 min (out of 49-hour course)
**Problems attempted:** 2 (self-directed, not from a problem set — built own examples)
**Problems solved independently:** 2
**Problems solved with help/hints:** 0
**Time per problem (rough):** not timed yet

**Session Score Breakdown:**
| Component | Score | Notes |
|---|---|---|
| Correctness | 24/30 | Both examples worked; no bugs surfaced (small sample size, so ceiling isn't fully tested yet) |
| Independence | 30/30 | Fully self-directed — built own examples, no hints needed |
| Complexity Awareness | 20/25 | Correctly implemented binary search unaided; explored 3 approaches for tradeoffs without prompting |
| Speed/Fluency | 3/15 | Not timed yet — can't score fluency without a baseline |
| **Session Score** | **77/100** | Strong for a first session, low sample size |

**What clicked today:** Correctly implemented binary search unaided, and instinctively explored 3 different approaches to the intersection problem (brute force, HashSet, size-based hybrid) without being asked to — shows tradeoff thinking, not just pattern-copying.
**What was hard:** Not yet identified — too early, only one real session so far.

**Overall DSA Mastery (cumulative):** ~12/100
**Focus for tomorrow:** Start timing problems (even roughly) once doing structured practice from the course/patterns video — timing is what interviews actually test, not just correctness.

---

### 2026-09-01 — Code io Tamil
**Pattern/topic:** Arrays fundamentals — access, update, insert, delete, search on a fixed-size array with separate length/size tracking
**Video/course time:** (fill in)
**Problems attempted:** 1 (`ArraysImplementationSimple` — custom array wrapper class)
**Problems solved independently:** 1 (full class structure — constructor, `printArray`, `getElement`, `setElement`, and initial logic for insert/delete/search)
**Problems solved with help/hints:** 3 (`deleteElement` size bug — incremented instead of decremented; `insertElement` vacancy check via `arr[index]==0` — unreliable since 0 is a valid value, replaced with unconditional shift+increment; `searchArray` loop bound — used `arr.length` instead of `size`)
**Time per problem (rough):** not timed yet

**Session Score Breakdown:**
| Component | Score | Notes |
|---|---|---|
| Correctness | 15/30 | 3 real bugs found across insert/delete/search — subtle, interview-relevant issues (wrong direction, unreliable sentinel check, wrong bound) |
| Independence | 18/30 | Core structure and getter/setter logic built unaided; insert/delete/search needed correction |
| Complexity Awareness | 25/25 | Correctly mapped every operation to its Big-O class (O(1) access/update, O(n) insert/delete/search) without needing it explained |
| Speed/Fluency | 3/15 | Not timed yet |
| **Session Score** | **61/100** | Solid conceptual grounding, correctness/rigor is the gap |

**What clicked today:** Modeled `length` (capacity) vs `size` (filled count) as separate fields, and mapped each operation to its Big-O complexity (access/update O(1), insert/delete/search O(n)).
**What was hard:** Handling "vacant" slots — initially tried checking `arr[index]==0` to detect an empty slot, which doesn't work since 0 is a valid stored value; also had a size-tracking bug in delete (incremented instead of decremented).

**Overall DSA Mastery (cumulative):** ~18/100
**Focus for tomorrow:** Continue Code io Tamil Arrays — revisit insert/delete to keep `size` accurate through shifts; keep this track separate from freeCodeCamp pace.

---

## Cumulative Mastery Trend

| Date | Track | Session Score | Overall Mastery (cumulative) |
|---|---|---|---|
| 2026-08-11 | freeCodeCamp | 77/100 | ~12/100 |
| 2026-09-01 | Code io Tamil | 61/100 | ~18/100 |

*Note: Session Score reflects how well a single session went in isolation. Overall Mastery reflects progress toward full interview-readiness across all DSA topics (arrays, strings, linked lists, trees, graphs, DP, etc.), and moves slowly by design.*