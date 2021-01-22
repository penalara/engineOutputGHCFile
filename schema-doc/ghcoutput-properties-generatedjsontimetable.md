# GeneratedJsonTimetable Schema

```txt
engineOutputGHCSchema#/properties/timetable
```

Object with the specification of the resolved schedule.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                     |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcOutput.schema.json\*](../out/ghcOutput.schema.json "open original schema") |

## timetable Type

`object` ([GeneratedJsonTimetable](ghcoutput-properties-generatedjsontimetable.md))

# GeneratedJsonTimetable Properties

| Property                                    | Type    | Required | Nullable       | Defined by                                                                                                                                                                               |
| :------------------------------------------ | ------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [assigendSections](#assigendsections)       | `array` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections")            |
| [anonymousClassRooms](#anonymousclassrooms) | `array` | Optional | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms") |

## assigendSections

List of sections assigned in the Timetable.


`assigendSections`

-   is required
-   Type: `object[]` ([AssigendSection](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assigendsections.md "engineOutputGHCSchema#/properties/timetable/properties/assigendSections")

### assigendSections Type

`object[]` ([AssigendSection](ghcoutput-properties-generatedjsontimetable-properties-assigendsections-assigendsection.md))

## anonymousClassRooms

Collection with anonymous classrooms made by the engine. The classrooms are grouped by set of classrooms.


`anonymousClassRooms`

-   is optional
-   Type: `object[]` ([AnonymousClassRoom](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms")

### anonymousClassRooms Type

`object[]` ([AnonymousClassRoom](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))
