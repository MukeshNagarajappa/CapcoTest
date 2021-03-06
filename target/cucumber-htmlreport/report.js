$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Test.feature");
formatter.feature({
  "line": 2,
  "name": "Verification of OI Shopping List for android App",
  "description": "",
  "id": "verification-of-oi-shopping-list-for-android-app",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Creation of two new lists in OI Shopping List app",
  "description": "",
  "id": "verification-of-oi-shopping-list-for-android-app;creation-of-two-new-lists-in-oi-shopping-list-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the shopping list app in mobile device",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on hamburger icon",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter name of new shopping list",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on OK button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Add new item to shopping List",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Delete item from the list",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.open_the_shopping_list_app_in_mobile_device()"
});
formatter.result({
  "duration": 35930076005,
  "status": "passed"
});
formatter.match({
  "location": "Test.click_on_hamburger_icon()"
});
formatter.result({
  "duration": 700713351,
  "status": "passed"
});
formatter.match({
  "location": "Test.Enter_name_of_new_shopping_list()"
});
formatter.result({
  "duration": 2799883676,
  "status": "passed"
});
formatter.match({
  "location": "Test.click_on_OK_button()"
});
formatter.result({
  "duration": 593640122,
  "status": "passed"
});
formatter.match({
  "location": "Test.Add_new_item_to_shopping_Lists()"
});
formatter.result({
  "duration": 13355018977,
  "status": "passed"
});
formatter.match({
  "location": "Test.delete_item_from_the_list()"
});
formatter.result({
  "duration": 8523884126,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Creation of lists \u0026 sort the list and validate the sorting of the list items",
  "description": "",
  "id": "verification-of-oi-shopping-list-for-android-app;creation-of-lists-\u0026-sort-the-list-and-validate-the-sorting-of-the-list-items",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "create new shopping list and sort the list items",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "sort the items in the shopping list",
  "keyword": "And "
});
formatter.match({
  "location": "Test.create_new_shopping_list_and_sort_the_list_items()"
});
formatter.result({
  "duration": 9182434136,
  "status": "passed"
});
formatter.match({
  "location": "Test.sort_the_items_in_the_shopping_list()"
});
formatter.result({
  "duration": 9096389665,
  "status": "passed"
});
});